object session {
  println("My name is snoop shady")
  def abs (number:Double) = if (number < 0) -number else number

  def isclose (guess:Double,x:Double): Boolean = {
    abs(guess*guess-x)<0.001
  }

  def improve (guess:Double,x:Double): Double = {
    (guess+(x/guess))/2
  }

  def sqrtnm (guess:Double,x:Double):Double = {
    println(guess)
    println(" ")
    if (isclose(guess,x)) guess else sqrtnm(improve(guess,x),x)

  }

  println(sqrtnm(1,0.001))
}