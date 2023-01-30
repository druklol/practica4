import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    print("Введите x:")
    var x:Double= readLine().toString().toDouble()
    print("Введите y:")
    var y:Double= readLine().toString().toDouble()
    print("Введите r:")
    var r:Double= readLine().toString().toDouble()
    var rez= sqrt(x.pow(2)+y.pow(2))
    if(rez<r)
    {
        print("Входит")
    }
    else
    {
        print("Не входит")
    }

}