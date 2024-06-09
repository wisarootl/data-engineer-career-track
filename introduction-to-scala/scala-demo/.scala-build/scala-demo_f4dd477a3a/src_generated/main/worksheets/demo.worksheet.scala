package worksheets


final class demo$u002Eworksheet$_ {
def args = demo$u002Eworksheet_sc.args$
def scriptPath = """worksheets/demo.worksheet.sc"""
/*<script>*/
val xs = 1 to 10 by 2

val mults = xs.map(_ * 2)

mults.foreach(println)
/*</script>*/ /*<generated>*//*</generated>*/
}

object demo$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new demo$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export demo$u002Eworksheet_sc.script as `demo.worksheet`

