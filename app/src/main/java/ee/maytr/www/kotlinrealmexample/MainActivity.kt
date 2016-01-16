package ee.maytr.www.kotlinrealmexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var realm: Realm by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        realm = Realm.getInstance(this)
        realm.executeTransaction {
            realm.copyToRealmOrUpdate(Model(1, "meta"))
        }
    }

    override fun onDestroy() {
        realm.close()
        super.onDestroy()
    }
}
