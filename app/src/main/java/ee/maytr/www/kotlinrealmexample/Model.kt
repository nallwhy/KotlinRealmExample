package ee.maytr.www.kotlinrealmexample

import io.realm.RealmObject
import io.realm.annotations.Ignore
import io.realm.annotations.PrimaryKey

/**
 * Created by json on 2016. 1. 16..
 */

public open class Model(
        @PrimaryKey public open var id: Int = 0,
        @Ignore public open var ignores: String = ""
): RealmObject() {

}