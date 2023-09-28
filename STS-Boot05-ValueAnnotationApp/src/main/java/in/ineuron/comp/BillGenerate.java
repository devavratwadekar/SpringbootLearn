package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerate {

	@Value("#{info.dosaPrice + info.idliPrice + info.vadaPrice}")
	private Float billAmount;

	@Value("A2B")
	private String hotelName;

	@Autowired
	private ItemInfo info;

	@Override
	public String toString() {
		return "BillGenerate [billAmount=" + billAmount + ", hotelName=" + hotelName + ", info=" + info + "]";
	}

}
