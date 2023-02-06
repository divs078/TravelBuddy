import java.util.ArrayList;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

public class userTrip implements Comparable<userTrip>{

  
  private String date;
  private String startTime;
  private String endTime;
  private String location;
  private String travelType;
  private ArrayList<String> buddies;


  public static void main(String[] args) {
        
  MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
  DB db = mongoClient.getDB( "mydb" );

    MongoClient mongoClient = new MongoClient();
    DB db = mongoClient.getDB("test");
    boolean auth = db.authenticate(myUserName, myPassword);

    DB db = mongoClient.getDB( "mydb" );

    List dbs = mongo.getDatabaseNames();
      for(String db : dbs)
      {
	    System.out.println(db);
      }

      DBCollection coll = db.getCollection("testCollection");
      Set colls = db.getCollectionNames();

      for (String s : colls)
      {
        System.out.println(s);
      }



    BasicDBObject query = new BasicDBObject("i", 52);

    cursor = coll.find(query);

    while(cursor.hasNext())
    {
   System.out.println(cursor.next());
    }
    cursor.close();


    db.things.find({j: {$ne: 3}, k: {$gt: 10} });



      FindIterable<document> iterable = coll.find(); // (1)
      MongoCursor<document> cursor = iterable.iterator(); // (2)


    

     userTrip currentObject;
     try {
        while(cursor.hasNext()) {
         currentObject = new userTrip()
         compareTo(cursor.next());
        if()
        }
      } finally {
      cursor.close();
    }
  }

 

}
  public userTrip(String date, String startTime, String endTime, String location, String travelType){
    this.date = date;
    this.startTime = startTime;
    this.endTime = endTime;
    this.location = location;
    this.travelType = travelType;
    buddies = new ArrayList<String>();
  }

  // returns the string time as an int number of minutes since 00:00
  public int getStart(){
    int colon = startTime.indexOf(':');
    int ret = Integer.parseInt(startTime.substring(0,colon))*60;
    ret += Integer.parseInt(startTime.substring(colon, colon+3));
    if(startTime.contains("PM")){
    ret += 720;
    }
    return ret;
  }
  // returns the string time as an int number of minutes since 00:00
   public int getEnd(){
    int colon = endTime.indexOf(':');
    int ret = Integer.parseInt(endTime.substring(0,colon))*60;
    ret += Integer.parseInt(endTime.substring(colon, colon+3));
    if(endTime.contains("PM")){
    ret += 720;
    }
    return ret;
  }
  //returns if the passed in userTrip overlaps with the current userTrip
  public boolean compareTo(userTrip in){
    return this.location == in.location && this.date == in.date && this.travelType == in.travelType && overLap(getStart(), getEnd(), in.getStart(), in.getEnd());
  }
  //return if the times specifically overlapp
  public static boolean overLap(int start1, int end1, int start2, int end2){
    if(start1 > start2 && start 1 < end2){
      return true;
    }
    if(start1 < start2 && end1 > start2){
      return true;
    }
    if(start1 == start2 || start1 == end2 || start2 == end1){
      return true;
    }
    return false;
  }
  public void addBuddy(String name){
    buddies.add(name);
  }

  public String toString(){
    String arr = "";
    for(int i = 0; i < buddies.size()-1; i++){
        arr += buddies.get(i) + ", ";
    }
    arr += buddies[buddies.length-1];
    return String.format("%s\t\t%s\n%s\t%s", this.location, this.date, this.time, arr);
  }
}
