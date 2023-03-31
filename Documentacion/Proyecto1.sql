CREATE DATABASE electronic;

\c electronic

CREATE SCHEMA controlarDatos;
CREATE SCHEMA controlarVenta;
CREATE SCHEMA controlarInven;

CREATE TABLE controlarDatos.cliente (
  dpi VARCHAR(100) PRIMARY KEY,
  nit VARCHAR(100),  
  nombre VARCHAR(200) NOT NULL,
  apellido VARCHAR(200) NOT NULL,
  direccion VARCHAR(100) NOT NULL,
  telefono INTEGER NOT NULL
);

CREATE TABLE controlarDatos.sucursal (
  idSucur SERIAL PRIMARY KEY,
  Ubicacion VARCHAR(100),
  direccion VARCHAR(100),
  telefono INTEGER,
  descripcion VARCHAR(225)
); 

CREATE TABLE controlarDatos.usuario (
  idUser SERIAL PRIMARY KEY,
  nombre VARCHAR(200) NOT NULL,
  apellido VARCHAR(200) NOT NULL, 
  direccion VARCHAR(100),
  telefono INTEGER NOT NULL,
  cargo VARCHAR(100),
  contras VARCHAR(100),  
  sucuriduser INTEGER NOT NULL,
  userdpi VARCHAR(100) NOT NULL,
  FOREIGN KEY (sucurId) REFERENCES controlarDatos.sucursal(idSucur)
  );

CREATE TABLE controlarInven.producto (
  idProd VARCHAR(100) PRIMARY KEY,
  nombre VARCHAR(150) NOT NULL,
  categoria VARCHAR(150) NOT NULL,
  descripcion VARCHAR(220) NOT NULL,
  precio NUMERIC(8,2) NOT NULL,
  stock  INTEGER NOT NUll
);

CREATE TABLE controlarInven.solicitar(
  soliId SERIAL PRIMARY KEY,
  sucurId INTEGER NOT NULL,
  sucuorigen INTEGER NOT NULL,
  prodId VARCHAR(100) NOT NULL,
  cantSol INTEGER NOT NULL,
  fechaPedido DATE NOT NULL,
  estado VARCHAR(100) NOT NULL, 
  FOREIGN KEY (sucuorigen) REFERENCES controlarDatos.sucursal(idSucur),
  FOREIGN KEY (sucurId) REFERENCES controlarDatos.sucursal(idSucur),
  FOREIGN KEY (prodId) REFERENCES controlarInven.producto(idProd)
);

CREATE TABLE controlarInven.inventario (
  prodId VARCHAR(100) NOT NULL,
  cantidad INTEGER NOT NULL,
  fechaIngreso DATE NOT NULL,
  sucurId INTEGER NOT NULL,
  FOREIGN KEY (sucurId) REFERENCES controlarDatos.sucursal(idSucur),
  FOREIGN KEY (prodId) REFERENCES controlarInven.producto(idProd)
);

CREATE TABLE controlarVenta.venta (
  idVenta SERIAL PRIMARY KEY,
  fecha TIMESTAMP NOT NULL,
  idCliente VARCHAR(100) NOT NULL,
  idUsuario INTEGER NOT NULL,
  sucursId INTEGER NOT NULL,
  total NUMERIC(10,2) NOT NULL,
  subTotal NUMERIC(10,2) NOT NULL,
  FOREIGN KEY (idCliente) REFERENCES controlarDatos.cliente(dpi),
  FOREIGN KEY (idUsuario) REFERENCES controlarDatos.usuario(idUser),
  FOREIGN KEY (sucursId) REFERENCES controlarDatos.sucursal(idSucur)
);

CREATE TABLE controlarVenta.detalleVenta (
  idDet SERIAL PRIMARY KEY,
  ventId INTEGER NOT NULL,
  productoId VARCHAR(100) NOT NULL,
  cantidad INTEGER NOT NULL,
  precioProd NUMERIC(10,2) NOT NULL,
  FOREIGN KEY (ventId) REFERENCES controlarVenta.venta(idVenta),
  FOREIGN KEY (productoId) REFERENCES controlarInven.producto(idProd)
);