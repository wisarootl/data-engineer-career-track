

final class `02$minusnote$u002Eworksheet$_` {
def args = `02$minusnote$u002Eworksheet_sc`.args$
def scriptPath = """02-note.worksheet.sc"""
/*<script>*/
val difference = 8 - 5
println(difference)

// * `val` are immutable, which means once initialized, they can't be reassigned.
// * `var` are mutable and can be reassigned.

// * Define immutable variables for clubs 2♣ through 4♣
val twoClubs: Int = 2
val threeClubs: Int = 3
val fourClubs: Int = 4

// * Define immutable variables for player names
val playerA: String = "Alex"
val playerB: String = "Chen"
val playerC: String = "Umberto"

// * playerC = "Umberto" // Reassignment to val playerC error!
// * Note: Reassignment error is Error at compile-time which cannot be handling at run-time

// * Define mutable variables for all aces
var aceClubs = 1
var aceDiamonds = 1
var aceHearts = 1
var aceSpades = 1

// * Create a mutable variable for player A (Alex)
// var playerA = "Alex"

// Change the point value of A♦ from 1 to 11
aceDiamonds = 11
var jackClubs = 10

// Calculate hand value for J♣ and A♦
println(jackClubs + aceDiamonds)

/*</script>*/ /*<generated>*//*</generated>*/
}

object `02$minusnote$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `02$minusnote$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `02$minusnote$u002Eworksheet_sc`.script as `02-note.worksheet`

