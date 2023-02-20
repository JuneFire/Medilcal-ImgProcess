const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  devServer:{
    host:'localhost',
    port:'8080',
    https: false,
    hot: false,
    proxy: null
  },
  transpileDependencies: true
})
