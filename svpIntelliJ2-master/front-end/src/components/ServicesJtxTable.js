import React, { Component } from 'react'
import './servicesjtx.css'; //Importamos el css para poder asignar clases css a nuestra salida en el metodo render

/**
 * Componente que muestra una tabla HTML usando el JSON que proporciona http://localhost:3001/servicesAll
 * 3001 cambia dependiendo el puerto donde esta ejecutandose el backend
 */
class ServicesJtxTable extends Component {

    /**
     * Constructor para inicializar servicesJtx en un arreglo vacio
     */
    constructor() {
        super()
        this.state = {
            servicesJtx : []
        };
    }

    /**
     * Metodo que se ejecuta solo una vez justo momentos antes que el metodo render
     * Este metodo se usa para hacer un Http Get a la URL y obtener el json
     */
    componentWillMount() {
        fetch('http://localhost:3001/servicesAll')
            .then(response => response.json()) // Se obtiene la respuesta y se le indica a Javascript que lo transforme a un JSON
            .then(servicesJtx => { //Ya que fue transformado se transfiere a la variable servicesJtx para su manipulacion
                servicesJtx.forEach(service => { //Se recorre el arreglo usando un forEach.
                    this.setState({ servicesJtx: this.state.servicesJtx.concat([service]) }); //Se agrega el elemento en el cual estamos posicionados al arreglo que iniciamos anteriorente en el constructor
                })
            })
    }

    /**
     * Metodo encargado de generar el HTML, es decir, la tabla HTML para mostrar los datos que hemos obtenido previamente en el metodo componentWillMount
     */
    render() {
        if (this.state.servicesJtx.length > 0) { //Evaluamos si el arreglo que tenemos dentro de this.state tiene elementos.
            /**
             * Todo lo que esta dentro de este return será 'HTML', en React se le conoce como JSX el cual es muy similar al HTML mezclado con Javascript
             * 1. Se recomienda encerrar nuestra salida en un unico div
             * 2. Recorremos el arreglo this.state.servicesJtx y se hace una interpretacion de cada objeto dentro del arreglo con el metodo map
             * 3. Se recomienda asignar al elemento padre que se repetira un atributo key para que react sea capaz de diferenciar a cada hijo, este valor key deberia ser unico para cada hijo. 
             *    en este caso el padre que se repite en cada iteracion es <tr>, mientras que td es hijo
             * 4. El atributo className se usa para asignarle una clase css a dicho elemento (Por eso se llama JSX, es casi HTML, en HTML esto se lograba con class)
             */
            return( 
                <div className="services-jtx-component">
                    <table className="services-jtx-component-table">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Columns</th>
                                <th>Name</th>
                                <th>Type</th>
                            </tr>
                        </thead>
                        <tbody>
                            { this.state.servicesJtx.map(service => 
                                <tr key={service.id}>
                                    <td>{service.id}</td>
                                    <td>{service.columns}</td>
                                    <td>{service.name}</td>
                                    <td>{service.type}</td>
                                </tr>
                            )}
                        </tbody>
                    </table>
                </div>
            )
        }
        else { //Si no tiene elementos mostramos el mensaje espera un momento. Esto es posible si al hacer la peticion GET se demora mas de lo normal
            return(
                <p>Espera un momento...</p>
            )
        }
    }
}

// Exportamos nuestro componente al exterior para que pueda ser utilizado desde otros componentes u archivos javascript
export default ServicesJtxTable;
