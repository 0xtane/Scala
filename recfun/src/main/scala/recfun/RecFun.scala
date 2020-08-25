package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c>r || c<0 || r<0) throw new Exception("Invalid argument, column can't be bigger than row")
    if (c==r || c==0 || r ==1) 1
    else pascal (c-1,r-1) + pascal (c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    //val balanced: Int = 0
    def isbalanced(chars: List[Char],balanced: Int): Boolean = {
      if (balanced<0) false
      else  {
        if (chars.isEmpty) {
          if (balanced==0) true else false
        }
        else {
          if (chars.head == '(') isbalanced(chars.tail,balanced+1)
          else
            if (chars.head == ')') isbalanced(chars.tail,balanced-1)
            else
              isbalanced(chars.tail,balanced)
        }
      }
    }
    isbalanced(chars,0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins.isEmpty) 0
    else
      if (money<0) 0
      else
        if (money==0) 1
        else
        countChange(money-coins.head,coins) + countChange(money,coins.tail)
  }
}
