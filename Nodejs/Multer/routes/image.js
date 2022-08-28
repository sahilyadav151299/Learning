const express = require('express')
const router = express.Router()

const imageController = require("../controller/image");


router.get("/", imageController.getImage);
router.post("/", imageController.setImage);

module.exports = router;