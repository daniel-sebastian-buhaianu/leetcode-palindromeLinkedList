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
    return true
}