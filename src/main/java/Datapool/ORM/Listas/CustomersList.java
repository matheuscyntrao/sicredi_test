package Datapool.ORM.Listas;

import java.util.List;
import Datapool.ORM.Objetos.Customer;
import Utils.JsonToObject;

public class CustomersList {

        JsonToObject jsonToObject = new JsonToObject();

        public List<Customer> getListaCustomer() {
            return jsonToObject.datapoolMapping("\\DataPool\\ORM\\Customer.json", Customer.class);
        }

}
