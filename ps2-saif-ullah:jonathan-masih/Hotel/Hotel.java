import java.util.ArrayList;
/**
 * Hotel rooms that are aviable and  are reserved.
 *
 * @author (Jonathan Masih And Saih ullah )
 * @version (3/22/2021)
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private ArrayList<Room> availableRooms; 
    private ArrayList<Room> reservedRooms;
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel()
    {
        availableRooms = new ArrayList<Room>();
        reservedRooms = new ArrayList<Room>();
    }

    public Hotel(ArrayList availableRooms , ArrayList reservedRooms){
        this.availableRooms = availableRooms;
        this.reservedRooms = reservedRooms;

    }

    public boolean addNewRoom(Room room){
        boolean roomAdded = false;
        boolean roomfound = false;

        for(int i = 0 ; i < availableRooms.size() ; i++){
            if (availableRooms.get(i).getRoomNumber() == room.getRoomNumber() ){
                roomfound = true;
                break;

            }else{
                roomfound = false;
            }
        }
        if(roomfound == false ){
            availableRooms.add(room);
            roomAdded = true;
        } 
        return roomAdded;
    }

    public ArrayList<Room> getAllAvailableRooms(){
        return availableRooms;

    }

    public ArrayList<Room> getAllReservedRooms(){
        return reservedRooms;

    }

    public Room getAvailableRoomByRoomNumber(int roomNumber){
        Room availableRoom = null;

        for(int i = 0 ; i < availableRooms.size()  ; i++){
            if(availableRooms.get(i) != null){
                if (availableRooms.get(i).getRoomNumber() == roomNumber){
                    return availableRooms.get(i);

                }
            }
        }

        return availableRoom;
    }

    public ArrayList<Room> getAvailableRooms(int floor, View view, int maxCapacity, boolean kitchenette){
        ArrayList<Room> availableRoomsWithCriteria = new ArrayList<Room>();
        for(int i = 0 ; i < availableRooms.size() ; i++){
            if(availableRooms.get(i).getRoomNumber() / 100 >= floor && availableRooms.get(i).getMaxCapacity() >= maxCapacity && 
            availableRooms.get(i).getView() == view && availableRooms.get(i).hasKitchenette() == kitchenette){

                availableRoomsWithCriteria.add(availableRooms.get(i));    

            } 
        }
        return availableRoomsWithCriteria;
    }

    public Room getReservedRoomByRoomNumber(int roomNumber){
        Room reseredRoom = null;

        for(int i = 0 ; i < reservedRooms.size() ; i++){

            if (reservedRooms.get(i).getRoomNumber() == roomNumber && reservedRooms.get(i) != null){
                reseredRoom = reservedRooms.get(i);

            }
        }

        return reseredRoom;
    }

    public boolean makeRoomAvailable(int roomNumber){
        boolean madedRoomAviable = false;
        for(int i = 0 ; i < reservedRooms.size() ; i++){
            if(reservedRooms.get(i) != null){
                if(reservedRooms.get(i).getRoomNumber() == roomNumber){
                    availableRooms.add(reservedRooms.get(i));
                    reservedRooms.remove(reservedRooms.get(i));
                    madedRoomAviable = true;
                    break;
                }else{
                    madedRoomAviable = false;
                }

            }
        }

        return madedRoomAviable;
    }

    public boolean reserveRoom(int roomNumber){
        boolean roomAvailable = false;
        for(int i = 0 ; i < availableRooms.size() ; i++){

            if(availableRooms.get(i).getRoomNumber() == roomNumber){
                reservedRooms.add(availableRooms.get(i));
                availableRooms.remove(availableRooms.get(i));
                roomAvailable = true;
                break;
            }else{
                roomAvailable = false;

            }
        }
        return roomAvailable;
    }

    @Override
    public String toString(){
        String stringBuffer = "";
        stringBuffer += "All Available Rooms: \n";
        for(int i = 0 ; i < availableRooms.size() ; i++){
            stringBuffer += availableRooms.get(i).toString() + "\n";
        }

        stringBuffer += "\nAll Reserved Rooms: \n";
        for(int i = 0 ; i < reservedRooms.size() ; i++){
            stringBuffer += reservedRooms.get(i).toString() + "\n";
        }

        return stringBuffer;
    }

}
