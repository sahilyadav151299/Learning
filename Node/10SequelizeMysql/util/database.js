const Sequelize = require('sequelize');
// Constructor imported

const sequelize = new Sequelize('nodedb', 'root', 'Sahil@root@786', 
    {
        dialect: 'mysql',
        host: 'localhost'
    }
);

// We're creating a new sequelize object and it will automatically 
// connect to the database or it will setup a connection pool itself

module.exports = sequelize;
 