package kozak.time

object TimeImplicits {
  implicit def integerToTime(timeInt: Int):Time = new Time(timeInt)
}

class Time(val amount: Int) {
  def hour(): Int = {
    return hours
  }

  def hours(): Int = {
    return amount * 3600
  }

  def minute(): Int = {
    return minutes
  }

  def minutes(): Int = {
    return amount * 60
  }

  def second(): Int = {
    return seconds
  }

  def seconds(): Int = {
    return amount
  }

  def and(addAmount: Int): Int = {
    return amount + addAmount
  }
}


