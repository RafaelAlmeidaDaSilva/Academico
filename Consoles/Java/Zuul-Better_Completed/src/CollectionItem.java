import java.util.ArrayList;

public class CollectionItem {

	private ArrayList<Item> itens = new ArrayList<Item>();

	public void addItem(Item item) {
		boolean conf = false;
		if (item != null) {
			for (Item _item : itens) {
				if (item.equals(_item))
					conf = true;
			}
			if (!conf)
				itens.add(item);
			else
				System.out.println("\nItem already exists\n");
		}
	}

	public Item transportItem(CollectionItem dest, Item item) {
		if (item != null)
			itens.remove(item);
		
		throw new NullPointerException("Item equals object null!");
	}

	public void removeItem(Item item) {
		itens.remove(item);
	}

	public Item getItem(String nameItem) {
		for (Item item : itens) {
			if (item.getName().equals(nameItem))
				return item;
		}
		
		throw new IllegalArgumentException("\nItem no localized\n");
	}

	public String getDescriptionItens() {
		String retorno = "";
		for (Item item : itens) {
			retorno += item.getDescriptionItem();
		}
		return retorno;
	}

}
