// app.js
const express = require('express'); // Se importa Express
const dbconnect = require('./config'); // Se importa la función de conexión
const ModelUser = require('./models'); // Se importa el modelo de usuario

const app = express(); // Se instancia Express
const router = express.Router(); // Se usa Router para modularizar

app.use(express.json()); // Para recibir JSON desde Postman
app.use(router); // El router se usa como middleware

// Ruta POST para crear un nuevo usuario
router.post("/", async (req, res) => {
    const body = req.body; // Recibe datos desde el cuerpo del request
    const respuesta = await ModelUser.create(body); // Guarda en MongoDB
    res.send(respuesta); // Responde al cliente
});

// Se inicia el servidor en puerto 3005
app.listen(3005, () => {
    console.log("Servidor activo en puerto 3005");
});

// Se conecta a la base de datos
dbconnect();
 