/**
 ********************************************************************
 * RabbitMQ configuration
 ********************************************************************
 */
rabbitmq {
    connections = [
            [
                    name: "defaultConnection",
                    isDefault: true,
                    host: "localhost",
                    username: "user",
                    password: "pass",
                    port: 56720,
                    //port: "56720", //wrong
                    virtualHost: "/app"
            ]
    ]
    queues = [
            //for core solution
            [
                    connection: "defaultConnection",
                    name      : "app.common.queue",
                    durable   : true
            ]
    ]
}