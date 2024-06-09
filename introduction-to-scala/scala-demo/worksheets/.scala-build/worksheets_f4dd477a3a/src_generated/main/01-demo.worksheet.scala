

final class `01$minusdemo$u002Eworksheet$_` {
def args = `01$minusdemo$u002Eworksheet_sc`.args$
def scriptPath = """01-demo.worksheet.sc"""
/*<script>*/
val xs = 1 to 10 by 2

val mults = xs.map(_ * 2)

mults.foreach(println)

/*</script>*/ /*<generated>*//*</generated>*/
}

object `01$minusdemo$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `01$minusdemo$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `01$minusdemo$u002Eworksheet_sc`.script as `01-demo.worksheet`

