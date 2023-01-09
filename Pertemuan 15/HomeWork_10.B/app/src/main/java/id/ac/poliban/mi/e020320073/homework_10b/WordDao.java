package id.ac.poliban.mi.e020320073.homework_10b;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    // insert one word
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    // get all words
    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}
