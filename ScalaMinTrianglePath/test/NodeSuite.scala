import org.scalatest.FunSuite

class NodeSuite extends FunSuite{
  
    test("constructor sets cost") {
	val node:Node = new Node(22)
	assert(node.cost === 22)
	assert(node.totalCost === Int.MaxValue)
  }
    
  test("SetCost returns cost if there are no parents or children") {
	val node:Node = new Node(0)
	assert(node.totalCost === Int.MaxValue)
	node.setCost
	assert(node.totalCost === node.cost)
  }
}