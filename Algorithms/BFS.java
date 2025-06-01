package versity_problems;
import java.util.*;
public class BFS {
        static int queue[]=new int[10];
        static int font=-1,rear=-1;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int mat[][]=new int[10][10];
            int node=8,edge=9,p1,p2,visit[]=new int[10],level[]=new int[10];
            System.out.println("Enter "+edge+" pair of nodes(edge): ");
            for(int i=0;i<edge;i++){
                p1=(int) sc.next().charAt(0)-'A';
                p2=(int) sc.next().charAt(0)-'A';
                mat[p1][p2]=mat[p2][p1]=1;
            }
            System.out.println("Enter the starting vertex of BFS traversing:");
            int src=(int) sc.next().charAt(0)-'A';
            enqueue(src);
            visit[src]=1;
            level[src]=0;
            while(font<rear){
                int p=dequeue();
                System.out.print((char)(p+'A')+" ");
                for(int c=0;c<node;c++){
                    if(mat[p][c]==1&&visit[c]!=1){
                        enqueue(c);
                        visit[c]=1;
                        level[c]=level[p]+1;
                    }
                }
            }}
        static void enqueue(int item){
            queue[++rear]=item;
        }
        static int dequeue(){
            return queue[++font];
        }
    }

