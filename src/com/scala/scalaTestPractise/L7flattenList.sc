package scalaTestPractise

object L7flattenList {
  
  
  def flatten(ls:List[Any]):List[Any] = ls flatMap {
	case ms: List[_] => flatten(ms)
    case e => List(e)
	}                                         //> flatten: (ls: List[Any])List[Any]
	
	val ls =List(List(List(1, 1), 2, List(3, List(5, 8))))
                                                  //> ls  : List[List[Any]] = List(List(List(1, 1), 2, List(3, List(5, 8))))
	flatten(ls)                               //> res0: List[Any] = List(1, 1, 2, 3, 5, 8)
}