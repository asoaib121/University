package Bfs;
import java.util.*;
public class Prims {

        static int Vertex=5;
        static int minKey(int key[],boolean mstSet[]){
            int min=Integer.MAX_VALUE,min_index=-1;
            for(int v=0;v<Vertex;v++){
                if(key[v]<min && mstSet[v]==false){
                    min=key[v];
                    min_index=v;
                }
            }
            return min_index;
        }
        static void printMST(int parent[],int key[]){
            int mst=0;
            System.out.println("Edge \t Weight");
            for(int i=0;i<Vertex;i++){
                mst+=key[i];
                System.out.println(parent[i]+" - "+i+"\t"+key[i]);
            }
            System.out.println("MST of graph: "+mst);
        }
        static void primMST(int graph[][]){
            int parent[]=new int[Vertex];
            int key[]=new int[Vertex];
            boolean mstSet[] =new boolean[Vertex];
            for(int i=0;i<Vertex;i++){
                parent[i]=-1;
                key[i]=Integer.MAX_VALUE;
                mstSet[i]=false;
            }
            int src=0;
            key[src]=0;
            for(int count=1;count<=Vertex;count++){
                int u=minKey(key,mstSet);
                mstSet[u]=true;
                for(int v=0;v<Vertex;v++){
                    if(graph[u][v]>0 && mstSet[v]==false && graph[u][v]<key[v]){
                        parent[v]=u;
                        key[v]=graph[u][v];
                    }
                }
            }
            printMST(parent,key);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int graph[][]=new int[][]{
                    {0,2,0,6,0},
                    {2,0,3,8,5},
                    {0,3,0,0,7},
                    {6,8,0,0,9},
                    {0,5,7,9,0}
            };
            primMST(graph);
        }
    }

