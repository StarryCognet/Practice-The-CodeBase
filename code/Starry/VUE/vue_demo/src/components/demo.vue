<template>
  <div class="demo">
    <p>{{a}}</p>
    <p>{{ age }}</p>
    <button @click="gage">{{ age }}</button>
  </div>
</template>

<script lang="ts">
  export default {
    name:'demo',
  }
</script>

<script lang="ts" setup>
  import {ref} from 'vue'

  let a = ref(666)
  let age = ref(1)


  function gage(){
    age.value += 1
    console.log(age);
  }
</script>

<style>

</style>