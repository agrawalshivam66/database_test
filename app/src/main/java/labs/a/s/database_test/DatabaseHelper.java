package labs.a.s.database_test;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Product";
    static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "productinfo";
    static final String PRODUCT_QUANTITY = "product_quantity";
    static final String PRODUCT_PRICE = "product_price";
    private static final String KEY_ID = "id";
    private static final String CREATE_TABLE = "CREATE TABLE "
            + TABLE_NAME + "(" + KEY_ID + " INTEGER PRIMARY KEY," + PRODUCT_QUANTITY
            + " INTEGER," + PRODUCT_PRICE + " INTEGER" + ")";
    private static final String DROP_TABLE = "drop table if exists" + TABLE_NAME;

    public DatabaseHelper(Context context ) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public long Add_User(User users) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, users.getmId());
        values.put(PRODUCT_QUANTITY, users.getmQuantity()); // product Quantity
        values.put(PRODUCT_PRICE, users.getmPrice()); // product price
        long id=db.insert(TABLE_NAME,null,values);
        db.close(); // Closing database connection
        return id;
    }
}


