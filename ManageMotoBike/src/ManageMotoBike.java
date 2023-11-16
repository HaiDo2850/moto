import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ManageMotoBike {
    List<MotoBike> motoBikeList = new ArrayList<>();

    ManageMotoBike() {

    }

    public void addMotoBike(MotoBike motoBike) {
        motoBikeList.add(motoBike);
    }

    public void showMotoBike() {
        for (MotoBike motoBike : motoBikeList) {
            System.out.println(motoBike);
        }
    }

    public void update(int id, MotoBike motoBike) {
        int index = -1;
        for (int i = 0; i < motoBikeList.size(); i++) {
            if (id == this.motoBikeList.get(i).getId()) {
                index = i;
            }
        }
        this.motoBikeList.set(index, motoBike);
    }

    public void deleteMotoBike(int id) {
        int index = -1;
        for (int i = 0; i < this.motoBikeList.size(); i++) {
            if (id == this.motoBikeList.get(i).getId()) {
                index = i;
            }
        }
        this.motoBikeList.remove(index);
    }

    public void findByName(String name) {
        boolean find = false;
        for (MotoBike motoBike : motoBikeList) {
            if (motoBike.getName().contains(name)) {
                System.out.println(motoBike);
                find = true;
            }
        }
        if(!find){
            System.out.println("Không tìm thấy thông tin xe máy ");
        }
    }

    public void findByValveInRange(double lowPrice , double highPrice) {
        List<MotoBike> listValveInRange = new LinkedList<>();
        for (MotoBike motoBike : motoBikeList) {
            if (lowPrice < motoBike.getPrice() && motoBike.getPrice() < highPrice ) {
                listValveInRange.add(motoBike);
            }
        }
        System.out.println("Các xe có giá trong khoảng trong khoảng từ " + lowPrice + " đến " + highPrice + " là: ");
        for (MotoBike motoBike : listValveInRange) {
            System.out.println(motoBike);
        }
        listValveInRange.clear();
    }

    public void sortUpByCc(){
        List<MotoBike> listSortUp = new LinkedList<>(motoBikeList);
        listSortUp.sort(Comparator.comparing(MotoBike::getCc));
        for (MotoBike motoBike:listSortUp){
            System.out.println(motoBike);
        }
    }

    public void sortDownByCc(){
        List<MotoBike> listSortDown = new LinkedList<>(motoBikeList);
        listSortDown.sort((a, b) -> Integer.compare( b.getCc() , a.getCc()));
        for (MotoBike motoBike:listSortDown) {
            System.out.println(motoBike);
        }
    }
}
