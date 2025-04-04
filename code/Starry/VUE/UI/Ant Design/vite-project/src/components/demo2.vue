<template>
  <a-button type="primary" @click="showDrawer">Open</a-button>
  <a-drawer
    v-model:open="open"
    title="Multi-level drawer"
    width="1020"
    :closable="false"
    :footer-style="{ textAlign: 'right' }"
    @close="onClose"
  >
    <a-button type="primary" @click="showChildrenDrawer">Two-level drawer</a-button>
    <a-drawer v-model:open="childrenDrawer" title="Two-level Drawer" width="720" :closable="false">
      <a-button type="primary" @click="showChildrenDrawer">This is two-level drawer</a-button>
    </a-drawer>

    <template #footer>
      <a-button style="margin-right: 8px" @click="onClose">Cancel</a-button>
      <a-button type="primary" @click="onClose">Submit</a-button>
    </template>
  </a-drawer>
</template>
<script lang="ts" setup>
import { ref } from 'vue';

const open = ref<boolean>(false);

const childrenDrawer = ref<boolean>(false);

const showDrawer = () => {
  open.value = true;
};
const onClose = () => {
  open.value = false;
};
const showChildrenDrawer = () => {
  childrenDrawer.value = true;
};
</script>

