package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class UserData {

    public String name;

    @JsonIgnore//ignorará la edad en la salida.
    public int age;

    @JsonProperty("real_address") //cambia la variable por una direccion (?)
    public String address;

  //  @JsonValue
    //public String info(){ //cambia notacion json por una oracion o cadena de texto
        //reemplaza las demas propiedades o notaciones anteriores asi que se debe usar con cuidado
      //  return "Username is "+name +" with age of: "+age+" and address: "+address;
    //}

    @JsonGetter("information") //devuelve los campos por separado y el nuevo parametro con los campos incluidos
    public String info(){
        return "Username is "+name +" with age of: "+age+" and address: "+address;
    }


public UserData(String name, int age, String address){
    this.name=name;
    this.age=age;
    this.address=address;


}
}
