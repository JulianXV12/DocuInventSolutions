// config.js
const mongoose = require('mongoose');

const dbconnect = () => {
    mongoose.set('strictQuery', true); // Evita advertencias innecesarias
    mongoose.connect("mongodb://127.0.0.1:27017/loginAPI") // conexión local
        .then(() => console.log("✅ Conexión exitosa"))
        .catch(err => console.log("❌ Error en conexión:", err.message));
};

module.exports = dbconnect;
 