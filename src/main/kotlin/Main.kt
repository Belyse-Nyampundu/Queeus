import java.security.DrbgParameters.Capability

fun main() {
var q = Queue(5)
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.dequeue()
    q.display()
    q.enqueue(54)
    q.enqueue(31)
    q.enqueue(64)
    q.enqueue(32)
    q.display()


}

class Queue(var capacity:Int){
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enqueue(value:Int){
   if(isFull()){
       println("Queue is full")
       return
   }
        data[rear] = value
        rear++
    }
    fun dequeue():Int?{
    if(isEmpty()){
        println("Queue is empty")
        return null
    }
        var removed = data[front]
        for (i in front until rear -1){
            data[i] = data[i+1]
        }
        return removed

    }
    fun peek():Int?{
        if (isEmpty()){
            return null
        }
        return data[front]
    }
    fun isFull():Boolean{
        return rear == front
    }
    fun isEmpty():Boolean{
        return  front == rear

    }
    fun display(){
  if(isEmpty()){
      return
  }
        for(i in front until rear)
            println(data[i])

    }
}

