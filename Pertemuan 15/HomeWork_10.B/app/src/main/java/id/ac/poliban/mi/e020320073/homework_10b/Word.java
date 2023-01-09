package id.ac.poliban.mi.e020320073.homework_10b;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// entity class with one column - word
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    Word(@NonNull String word) {
        this.mWord = word;
    }

    String getWord(){
        return this.mWord;
    }
}