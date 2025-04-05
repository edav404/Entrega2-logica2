public class ListaPedidos {
    private Pedido cabeza;
    
    public void agregarPedido(String producto, int cantidad) {
        Pedido nuevo = new Pedido(producto, cantidad, null, null);
        //Si la cabeza está vacía, crearemos un nuevo pedido
        //y lo asignaremos a la cabeza de la lista
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Pedido temp = cabeza;

            //Si este contiene información, entonces temp le pasa el objeto que reciba a siguiente
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public void mostrarPedido(){
        Pedido temp = cabeza;
        while (temp != null) {
            System.out.println("Pedido: " + temp.producto + " Cantidad: " + temp.cantidad);
            temp = temp.siguiente;
        }
    }
}
