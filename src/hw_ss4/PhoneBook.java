package hw_ss4;

import java.util.ArrayList;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;

    @Override
    public void insertPhone(String name, String phoneNum) {
        PhoneNumber result = this.searchPhone(name);
        if(result.name!=null) {
            if(!result.phone.contains(phoneNum)){
                result.phone.add(phoneNum);
            }
        }else{
            ArrayList<String> phoneArr = new ArrayList<String>();
            phoneArr.add(phoneNum);
            PhoneList.add(new PhoneNumber(name,phoneArr));
        }
    }

    @Override
    public void removePhone(String name) {
        if (searchPhone(name).name!= null) PhoneList.remove(searchPhone(name));
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        PhoneNumber updated = searchPhone(name);
        updated.phone.remove(oldPhone);
        updated.phone.add(newPhone);
        this.removePhone(name);
        PhoneList.add(updated);
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        PhoneNumber result = new PhoneNumber(null,new ArrayList<String>());
        for (PhoneNumber p:PhoneList ){
            if (p.name==name) result = p;
        }
        return result;
    }

    @Override
    public void sort() {
        for (PhoneNumber p: PhoneList) {
            for (PhoneNumber q: PhoneList) {
                if (p.name.compareTo(q.name)<=0){
                    PhoneList.set(PhoneList.indexOf(p),q);
                    PhoneList.set(PhoneList.indexOf(q),p);
                    break;
                }
            }
        }
    }
}
