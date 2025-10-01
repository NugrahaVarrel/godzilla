## Bagian A — Pilihan Ganda (10 Soal)

```
1. SharedPreferences cocok digunakan untuk…
   a) Menyimpan foto profil pengguna
   b) Menyimpan token login dan setting ringan (BENAR)
   c) Menyimpan database transaksi
   d) Menyimpan file audio

2. Default mode paling aman untuk membuat SharedPreferences adalah:
   a) MODE_MULTI_PROCESS
   b) MODE_APPEND
   c) MODE_PRIVATE (BENAR)
   d) MODE_WORLD_READABLE

3. Perbedaan `apply()` dan `commit()` di SharedPreferences.Editor:
   a) `apply()` sinkron, `commit()` async
   b) `apply()` async, `commit()` sinkron (BENAR)
   c) Keduanya async
   d) Keduanya sinkron

4. SharedPreferences disimpan secara fisik di…
   a) RAM
   b) Internal storage sandbox aplikasi (BENAR)
   c) External storage
   d) Firebase Realtime Database

5. Komponen wajib Room:
   a) @Model, @Repository, @Database
   b) @Entity, @Dao, @Database (BENAR)
   c) @Entity, @ViewModel, @Database
   d) @Table, @SQLite, @Repository

6. Primary key auto-generate di Room ditulis:
   a) `@PrimaryKey val id: Int`
   b) `@PrimaryKey(autoGenerate = true) val id: Int = 0` (BENAR)
   c) `@Id(auto = true) val id: Int`
   d) `@Primary(auto = true) val id: Int`

7. Jika kita mengubah struktur tabel Room tanpa migrasi:
   a) Database auto-update aman
   b) Crash dengan `IllegalStateException` (BENAR)
   c) Hanya warning di log
   d) Room pindah otomatis ke SharedPreferences

8. Untuk operasi database berat di Room agar tidak ANR, sebaiknya:
   a) Jalankan langsung di Main Thread
   b) Gunakan `allowMainThreadQueries()`
   c) Gunakan coroutine Dispatchers.IO atau RxJava (BENAR)
   d) Pakai Thread.sleep

9. `@Insert(onConflict = REPLACE)` di Room artinya:
   a) Menolak insert jika sudah ada row
   b) Menghapus semua data lama
   c) Menimpa data lama dengan primary key sama (BENAR)
   d) Tidak ada efek

10. Untuk mendapatkan data real-time dari Room:
    a) Return `LiveData` atau `Flow` di DAO (BENAR)
    b) Return `Int` di DAO
    c) Return `String` di DAO
    d) Tidak bisa real-time


```

---

## Bagian B — Isian Singkat (3 Soal)

11. Tulis kode satu baris untuk mendapatkan SharedPreferences bernama `"prefs"` di `Context`.
    ```kotlin
    val prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    ```

12. Sebutkan 2 perbedaan `apply()` dan `commit()` di SharedPreferences.
- apply() → asynchronous, tidak mengembalikan hasil (lebih cepat).
- commit() → synchronous, mengembalikan Boolean (true jika sukses).

13. Bagaimana membuat singleton instance RoomDatabase bernama `AppDb` (builder standar, tanpa DI)?
    ```kotlin
    @Database(entities = [Note::class], version = 1)
    abstract class AppDb : RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        @Volatile private var INSTANCE: AppDb? = null
        fun getInstance(context: Context): AppDb =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDb::class.java, "app_db"
                ).build().also { INSTANCE = it }
            }
    }
}

    ```
---

## Bagian C — Perbaikan Kode (7 Soal)

14. Perbaiki kode agar menyimpan string `username` dengan benar:

```kotlin
val prefs = getSharedPreferences("user", MODE_PRIVATE)
prefs.edit()
putString("username", name)
apply()
```
**Correct Code**
```kotlin
val prefs = getSharedPreferences("user", MODE_PRIVATE)
prefs.edit()
    .putString("username", name)
    .apply()
```

15. Apa output berikut jika key `"counter"` belum pernah dibuat?

```kotlin
val p = getSharedPreferences("app", MODE_PRIVATE)
val counter = p.getInt("counter", 5)
p.edit().putInt("counter", counter + 1).commit()
val after = p.getInt("counter", 0)
println(after)
```
**Output**
```kotlin
counter awal = 5 (default)
lalu disimpan 5 + 1 = 6
after = 6
✅ Output: 6
```

16. Tambahkan kode listener agar mendeteksi perubahan key `"theme"` di SharedPreferences dan unregister di `onDestroy()`.
```kotlin
val listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, key ->
    if (key == "theme") {
        println("Theme changed: ${prefs.getString("theme", "default")}")
    }
}

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val prefs = getSharedPreferences("prefs", MODE_PRIVATE)
    prefs.registerOnSharedPreferenceChangeListener(listener)
}

override fun onDestroy() {
    super.onDestroy()
    val prefs = getSharedPreferences("prefs", MODE_PRIVATE)
    prefs.unregisterOnSharedPreferenceChangeListener(listener)
}

```

17. Perbaiki entity Room berikut:

```kotlin
@Entity(tableName = "notes")
data class Note(
  @PrimaryKey(autoGenerate = true)
  val id: Int?,
  val title: String,
  @ColumnInfo(defaultValue = "''")
  val content: String
)
```

**Correct Code**
```kotlin
@Entity(tableName = "notes")
data class Note(
  @PrimaryKey(autoGenerate = true)
  val id: Int = 0,
  val title: String,
  @ColumnInfo(defaultValue = "")
  val content: String
)
```

18. DAO berikut error, perbaiki:

```kotlin
@Dao
interface NoteDao {
  @Insert
  suspend fun insertAll(notes: List<Note>): Int
}
```

**Correct Code**
```kotlin
@Dao
interface NoteDao {
    @Insert
    suspend fun insertAll(notes: List<Note>)
}
```

19. Lengkapi kode untuk membuat database dan mengambil semua `Note` di background:

```kotlin
val db = AppDb.getInstance(context)
// ???
println(all.size)
```

**Correct Code**
```kotlin
val db = AppDb.getInstance(context)
GlobalScope.launch(Dispatchers.IO) {
    val all = db.noteDao().getAll()
    println(all.size)
}
```

20. Perbaiki query DAO berikut agar mengambil semua user terurut ASC:

```kotlin
@Query("GET * FROM users ORDER name ASC")
fun getAll(): List<User>
```

**Correct Code**
```kotlin
@Query("SELCT * FROM users ORDER name ASC")
fun getAll(): List<User>
```

---
