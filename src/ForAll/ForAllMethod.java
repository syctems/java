package ForAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForAllMethod
{
    public static void main(String[] args)
    {
        ForAllMethod forAllMethod = new ForAllMethod();
        forAllMethod.takeAll();

    }

    public void takeAll()
    {
        ArrayList<node> list = new ArrayList<node>();
        list.add(new node(1,"A0",0));
        list.add(new node(5,"B1",4));
        list.add(new node(3,"A2",2));
        list.add(new node(4,"B0",0));
        list.add(new node(2,"A1",1));
        list.add(new node(6,"A3",2));
        list.add(new node(7,"C3",3));
        getChild(list,0);


    }

    public void getChild(ArrayList<node> nodes,Integer parentId)
    {
        for (node s : nodes)
        {
            if(s.parentId.equals(parentId))
            {
                System.out.println(s);
                getChild(nodes,s.id);
            }
        }
    }



    class node
    {
        public node(Integer id, String name, Integer parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }

        @Override
        public String toString() {
            return "node{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", parentId=" + parentId +
                    '}';
        }

        public Integer id;
        public String name;
        public Integer parentId;
    }
}
