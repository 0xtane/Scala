package problems

object Problems {

  //If we list all the natural numbers below 10 that are multiples of
  // 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  //
  //Find the sum of all the multiples of 3 or 5 below 1000.
  def multipleof35 (num: Int) : Int = {
    def mult (num: Int,acc: Int,it: Int,multipleof: Int) :Int = {
      println(num,acc,it,multipleof)
      if (num<multipleof) acc
      else mult(num-multipleof,acc+(multipleof*it),it+1,multipleof)
    }
    mult(num-1,0,1,3) + mult(num-1,0,1,5) - mult(num-1,0,1,15)
  }

}



