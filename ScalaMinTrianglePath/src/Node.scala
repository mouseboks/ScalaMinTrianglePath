
class Node(costa: Int) {
	val cost:Int = costa
	var totalCost:Int = Int.MaxValue
	var leftChild:Node = null
	var rightChild:Node = null
	var lowestCostChild:Node = null
	
	def setCost() {
	  
	  if(leftChild == null && rightChild == null) {
	    totalCost = cost
	    return
	  }
	  
	  var leftCost = Int.MaxValue
	  var rightCost = Int.MaxValue
	  if(leftChild != null) leftCost = leftChild.totalCost
	  if(rightChild != null) rightCost = rightChild.totalCost
	  
	  totalCost = Math.min(leftCost, rightCost) + cost
	  lowestCostChild  = if (leftCost < rightCost) leftChild else rightChild 
	}
}