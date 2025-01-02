class DataNode:
  def __init__(self, data=None):
    self.data = data
    self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.count = 0

    def traverse(self):
        if not self.head:
            print("This is an empty list.")
            return
        now = self.head
        go = ""
        while now:
            go += now.data
            if now.next:
                go += " -> "
            now = now.next
        print(go)
    
    def insert_last(self, data):
        new = DataNode(data)
        if not self.head:
            self.head = new
        else:
            now = self.head
            while now.next:
                now = now.next
            now.next = new
        self.count += 1

    def insert_front(self,data):
        new = DataNode(data)
        new.next = self.head
        self.head = new
        self.count +1

    def insert_before(self,node, data):
        new = DataNode(data)
        if not self.head:
            print("Cannot insert, "+node+" does not exist")
            return
        if self.head.data == node:
           self.insert_front(data)
           return
    def delete(self, data):
        if self.head is None:
            print("Cannaot delete, "+data+" does not exist.")
        
        if self.head.data == data:
            self.head = self.head.next
            self.count -= 1
            return

        prev = None
        current = self.head
        while current and current.data != data:
            prev = current
            current = current.next

        if current is None:
            print("Cannot delete, " + data + " does not exist.")
            return

        prev.next = current.next
        self.count -= 1

def main():
  mylist = SinglyLinkedList()
  for _ in range(int(input())):
    text = input()
    condition, data = text.split(": ")
    if condition == "F":
      mylist.insert_front(data)
    elif condition == "L":
      mylist.insert_last(data)
    # elif condition == "B":
    #     mylist.insert_before(*data.split(", "))
    # elif condition == "D":
    #     mylist.delete(data)
    else:
      print("Invalid Condition!")
  mylist.traverse()

main()