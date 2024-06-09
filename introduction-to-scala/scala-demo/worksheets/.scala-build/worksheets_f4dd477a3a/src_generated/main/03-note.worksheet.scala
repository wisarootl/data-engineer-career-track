

final class `03$minusnote$u002Eworksheet$_` {
def args = `03$minusnote$u002Eworksheet_sc`.args$
def scriptPath = """03-note.worksheet.sc"""
/*<script>*/
var queenDiamonds = 10
var threeClubs = 3
var aceHearts = 1
var fiveSpades = 5
var kingHearts = 10
var jackHearts = 10

def maxHand(handA: Int, handB: Int): Int = {
  if (handA > handB) handA
  else handB
}

// Calculate hand values
var handPlayerA: Int = queenDiamonds + threeClubs + aceHearts + fiveSpades
var handPlayerB: Int = kingHearts + jackHearts

// Find and print the maximum hand value
println(maxHand(handPlayerA, handPlayerB))

// * Create and parameterize an array for a round of Twenty-One
// `Array`: mutable sequence of objects with the same type
// `List`: immutable sequence of objects with the same type
val hands: Array[Int] = new Array[Int](3) //Array(0, 0, 0)

var tenClubs = 10
var fourDiamonds = 4
var nineSpades = 9
var nineHearts = 9
var twoClubs = 2
var threeSpades = 3

// Initialize the first player's hand in the array
hands(0) = tenClubs + fourDiamonds

// Initialize the second player's hand in the array
hands(1) = nineSpades + nineHearts

// Initialize the third player's hand in the array
hands(2) = twoClubs + threeSpades

val hands2 = Array(
  tenClubs + fourDiamonds,
  nineSpades + nineHearts,
  twoClubs + threeSpades
) // Array(14, 18, 5)

// Initialize player's hand and print out hands before each player hits
hands(0) = tenClubs + fourDiamonds
hands(1) = nineSpades + nineHearts
hands(2) = twoClubs + threeSpades
hands.foreach(println)

var fiveClubs = 5
var queenSpades = 10
var kingClubs = 10

// Add 5♣ to the first player's hand
hands(0) = hands(0) + fiveClubs

// Add Q♠ to the second player's hand
hands(1) = hands(1) + queenSpades

// Add K♣ to the third player's hand
hands(2) = hands(2) + kingClubs

// Print out hands after each player hits
hands.foreach(println)

// Initialize a list with an element for each round's prize
val prizes = List(10, 15, 20, 25, 30)
println(prizes)

// Prepend to prizes to add another round and prize
val newPrizes = 5 :: prizes
println(newPrizes)

// Initialize a list with an element each round's prize
val prizes2 = 10 :: 15 :: 20 :: 25 :: 30 :: Nil
println(prizes2)

// The original NTOA and EuroTO venue lists
val venuesNTOA = List("The Grand Ballroom", "Atlantis Casino", "Doug's House")
val venuesEuroTO = "Five Seasons Hotel" :: "The Electric Unicorn" :: Nil

// Concatenate the North American and European venues
val venuesTOWorld = venuesNTOA ::: venuesEuroTO

/*</script>*/ /*<generated>*//*</generated>*/
}

object `03$minusnote$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `03$minusnote$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `03$minusnote$u002Eworksheet_sc`.script as `03-note.worksheet`

