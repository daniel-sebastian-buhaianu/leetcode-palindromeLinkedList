fun main() {
    // head = [1, 2, 2, 1]
    val n1 = ListNode(1)
    val n2 = ListNode(1)
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
    // Find the middle element
    var slowPtr = head
    var fastPtr = head
    while (fastPtr != null && fastPtr.next != null) {
        slowPtr = slowPtr?.next
        fastPtr = fastPtr.next
        fastPtr = fastPtr?.next
    }

    // If number of nodes is odd, then move slowptr to the right
    if (fastPtr != null && fastPtr.next == null) {
        slowPtr = slowPtr?.next
    }

    // Reverse the second half
    var prev: ListNode? = null
    var temp: ListNode?
    while (slowPtr != null && slowPtr.next != null) {
        temp = slowPtr.next
        slowPtr.next = prev
        prev = slowPtr
        slowPtr = temp
    }
    if (slowPtr != null) {
        slowPtr.next = prev
    }

    // Compare first half with second half
    // If we find any inequality, return false
    fastPtr = head
    while (slowPtr != null && fastPtr != null) {
        if (slowPtr.`val` != fastPtr.`val`) {
            return false
        }
        slowPtr = slowPtr.next
        fastPtr = fastPtr.next
    } 

    return true
}