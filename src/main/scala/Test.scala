import com.github.nscala_time.time.Imports._
object Test extends App {

  // returning the current time
  def currentDate(): DateTime ={
    DateTime.now()
  }

  // returning the date after 10 days from now
  def dateAfterTenDays(): DateTime ={
    DateTime.now() + 10.days
  }

  // returning the date before 10 days from now
  def dateBeforeTenDays(): DateTime ={
    DateTime.now() - 10.days
  }

  def convertFormat(date:DateTime): String ={
    val dt = new DateTime()
    date.toLocalDate.toString("MM/dd/yyyy")
  }
  println(currentDate())
  println(dateAfterTenDays())
  println(dateBeforeTenDays())
  println(convertFormat(DateTime.now()))
}
