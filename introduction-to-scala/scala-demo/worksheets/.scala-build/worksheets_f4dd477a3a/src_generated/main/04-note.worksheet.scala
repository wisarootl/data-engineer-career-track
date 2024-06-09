

final class `04$minusnote$u002Eworksheet$_` {
def args = `04$minusnote$u002Eworksheet_sc`.args$
def scriptPath = """04-note.worksheet.sc"""
/*<script>*/
var sevenClubs = 7
var kingDiamonds = 10
var fourSpades = 4

// Point value of a player's hand
val hand = sevenClubs + kingDiamonds + fourSpades

// Congratulate the player if they have reached 21
if (hand == 21) {
  println("Twenty-One!")
}

var threeSpades = 3

// Point value of a player's hand
val hand2 = sevenClubs + kingDiamonds + threeSpades

// Inform a player where their current hand stands
val informPlayer: String = {
  if (hand2 > 21)
    "Bust! :("
  else if (hand2 == 21)
    "Twenty-One! :)"
  else
    "Hit or stay?"
}

// Print the message
print(informPlayer)

/*</script>*/ /*<generated>*//*</generated>*/
}

object `04$minusnote$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `04$minusnote$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `04$minusnote$u002Eworksheet_sc`.script as `04-note.worksheet`

