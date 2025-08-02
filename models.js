// models.js
const mongoose = require('mongoose');

// Se define el esquema para los documentos de la colección "usuarios"
const userModel = new mongoose.Schema({
    // Campo 'nomuser' es el nombre del usuario
    nombre: {
        type: String,
        required: true
    },
    correo: {
        type: String,
        required: true,
        unique: true
    },
    // Campo 'password' es la contraseña del usuario
    contrasena: {
        type: String,
        required: true
    }
}, {
    // timestamps guarda automáticamente createdAt y updatedAt
    timestamps: true,
    // Desactiva la versión del documento (__v)
    versionKey: false
});

module.exports = mongoose.model('usuarios', userModel);