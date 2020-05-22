class Circle(private val v : Double) : Solids {

    private val pi = 3.14;

    override fun GetArea() : Double {
        return pi*v*v;
    }

    override fun GetVolume() : Double {
        return pi*v*v*v;
    }

}