package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "info")
public class ItemInfo {

	@Value("${item.dosa.price}")
	public float dosaPrice;

	@Value("${item.idli.price}")
	public float idliPrice;

	@Value("${item.vada.price}")
	public float vadaPrice;

	@Override
	public String toString() {
		return "ItemInfo [dosaPrice=" + dosaPrice + ", idliPrice=" + idliPrice + ", vadaPrice=" + vadaPrice + "]";
	}

}
