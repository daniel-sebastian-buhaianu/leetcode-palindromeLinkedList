fun main() {
    // head = [1, 2, 2, 1]
    val n1 = ListNode(1)
    val n2 = ListNode(2)
    val n3 = ListNode(2)
    val n4 = ListNode(1)

    n1.next = n2
    n2.next = n3
    n3.next = n4

    if (isPalindrome(n1)) {
        println("true")
    } else {
        println("false")
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null 
}

fun isPalindrome(head: ListNode?): Boolean {
    var ptr: ListNode? = head
    var number: String = ""
    while (ptr != null) {
        number += ptr.`val`
        ptr = ptr.next
    }

    val mid: Int = number.length / 2
    var i = 0
    var j = number.length - 1
    var end = if (number.length % 2 == 0) mid else mid+1
    while (i < mid && j >= end) {
        if (number[i] != number[j])
            return false
        i++
        j--
    }

    return true
}