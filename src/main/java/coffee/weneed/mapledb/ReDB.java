package coffee.weneed.mapledb;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;

public class ReDB {
	private static ReDB rethink = null;

	public static final RethinkDB r = RethinkDB.r;

	public static ReDB get() {
		return rethink;
	}

	public static ReDB setRethinkDB(ReDB rthink) {
		rethink = rthink;
		return rethink;
	}

	public Connection conn = r.connection().hostname("127.0.0.1").port(28015).user("admin", PrivateConstants.DB_PASS).db("maple_db").connect();
}
