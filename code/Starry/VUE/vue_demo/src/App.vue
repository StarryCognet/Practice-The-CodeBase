<template>
  <div class="app">
    <h1>你好啊！</h1>
    <demo/>
  </div>
</template>

<script lang="ts">
import demo from './components/demo.vue'

  export default {
    name:'App', //组件名
    components:{demo}
  }
</script>

<style>
  .app {
    background-color: #ddd;
    box-shadow: 0 0 10px;
    border-radius: 10px;
    padding: 20px;
  }
</style>