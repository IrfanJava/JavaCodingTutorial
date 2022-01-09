package JavaConcurrency;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.sql.Time;
import java.util.*;
public class ApplePicker {

	public static void main(String[] args) {
		AppleTree[] appletrees=AppleTree.newTreeGarden(6);
		
		Callable<Void> appletree1=createApplePicker(appletrees,0,2,"Bob");
		Callable<Void> appletree2=createApplePicker(appletrees,2,4,"Harry");
		Callable<Void> appletree3=createApplePicker(appletrees,4,6,"Henry");
		System.out.println();
		List<Callable<Void>> applelist=new ArrayList<>();
		applelist.add(appletree3);
		applelist.add(appletree2);
		applelist.add(appletree1);
		ForkJoinPool.commonPool().invokeAll(applelist);
		System.out.println("All apples were collected");
		

	}
	public static Callable<Void> createApplePicker(AppleTree[] appleTrees,int fromindexinclusive,int toindexexclusive,String workerName){
		return () -> {
			for(int i=fromindexinclusive;i<toindexexclusive;i++){
				appleTrees[i].pickApples(workerName);
			}
			return null;
		};
	}
	

}
class AppleTree{
	private final String treeLabel;
	private final int numberOfApples;
	
	public AppleTree(String treeLabel) {
		this.treeLabel=treeLabel;
		numberOfApples=3;
	}
	
	public static  AppleTree[] newTreeGarden(int size) {
		AppleTree[] appletrees=new AppleTree[size];
		for(int i=0;i<size;i++) {
			appletrees[i]=new AppleTree("#"+i);
		}
		return appletrees;
	}
	public int pickApples(String workerName) {
		try {
			System.out.printf("%s started picking apples from %s \n",workerName,treeLabel);
			TimeUnit.SECONDS.sleep(1);
			System.out.printf("%s picked %d apples from %s \n",workerName,numberOfApples,treeLabel);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return numberOfApples;
	}
}
