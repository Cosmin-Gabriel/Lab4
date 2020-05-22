class ComputeV(private val shapes : Array<SolidShape>) : ComputeData{

    override fun Sum() : Double {
        var sum : Double = 0.0

        shapes.forEach {
            sum+= it.GetVolume();
        }
        return sum;
    }

}